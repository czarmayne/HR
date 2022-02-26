package com.b2b.employee.monitoring.presentation.rest

import com.b2b.employee.monitoring.App
import com.b2b.employee.monitoring.presentation.rest.dto.OTResponseDto
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.*
import org.springframework.test.annotation.DirtiesContext
import spock.lang.Specification
import spock.lang.Stepwise

import static com.b2b.employee.monitoring.factory.OTRequestDtoFactory.defaultOvertimeRequest

@Stepwise
@SpringBootTest(classes = [App], webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DirtiesContext
class OvertimeControllerSpec extends Specification {

    @Autowired
    TestRestTemplate restTemplate

    def "Bad Request for Overtime Filing"() {
        given: "a invalid request"
        def request = defaultOvertimeRequest(reason: null)

        and: "needed http items"
        def headers = new HttpHeaders()
        headers.setContentType(MediaType.APPLICATION_JSON)
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON) as List<MediaType>)
//        headers.set("corporate-id") //FIXME: will add custom headers in the future for security
        def httpEntity = new HttpEntity(request, headers)

        when: "an employee submits the request"
        def response = restTemplate.exchange("/overtime",
                HttpMethod.POST,
                httpEntity,
                OTResponseDto.class)

        then: "app should be able to process it successfully"
        response.statusCode == HttpStatus.BAD_REQUEST
    }

}
