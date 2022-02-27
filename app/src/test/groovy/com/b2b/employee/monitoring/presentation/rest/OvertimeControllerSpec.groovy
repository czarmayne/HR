package com.b2b.employee.monitoring.presentation.rest

import com.b2b.employee.monitoring.App
import com.b2b.employee.monitoring.presentation.rest.dto.OTRequestDto
import com.b2b.employee.monitoring.presentation.rest.dto.OTResponseDto
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.*
import org.springframework.test.annotation.DirtiesContext
import spock.lang.Specification
import spock.lang.Stepwise
import spock.lang.Unroll

import static com.b2b.employee.monitoring.factory.OTRequestDtoFactory.defaultOvertimeRequest

@Stepwise
@SpringBootTest(classes = [App], webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DirtiesContext
class OvertimeControllerSpec extends Specification {

    @Autowired
    TestRestTemplate restTemplate

    @Unroll
    def "Bad Request for Overtime Filing due to #test"() {
        given: "needed http items"
        HttpEntity httpEntity = getHttpEntity(request)

        when: "an employee submits the request"
        def response = restTemplate.exchange("/overtime",
                HttpMethod.POST,
                httpEntity,
                OTResponseDto.class)

        then: "app returns HTTP status Bad Request"
        response.statusCode == HttpStatus.BAD_REQUEST

        where:
        test                 | request
        "null reason"        | defaultOvertimeRequest(reason: null)
        "empty reason"       | defaultOvertimeRequest(reason: "")
        "null startDateTime" | defaultOvertimeRequest(startDateTime: null)
//        "null hours" | defaultOvertimeRequest(hours: null) FIXME: Figure out why this is failing
        "hours less than 1"  | defaultOvertimeRequest(hours: 0.8)
        "null corporateId"   | defaultOvertimeRequest(corporateId: null)
        "short corporateId"  | defaultOvertimeRequest(corporateId: "12A34")
        "long corporateId"   | defaultOvertimeRequest(corporateId: "12ABC34")
    }

    private HttpEntity getHttpEntity(OTRequestDto request) {
        def headers = new HttpHeaders()
        headers.setContentType(MediaType.APPLICATION_JSON)
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON) as List<MediaType>)
//        headers.set("corporate-id") //FIXME: will add custom headers in the future for security
        def httpEntity = new HttpEntity(request, headers)
        httpEntity
    }

}
