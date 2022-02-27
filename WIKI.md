
## API Reference

#### Create an OT request

```http
  POST /v1/overtime
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `dateTime`| `string` | **Required**. ISO 8601 Date and Time (e.g., 2022-02-02 15:00:00.000)|
| `reason`  | `string` | **Required**. Why do you need to extend hours? |
| `empId`   | `string` | **Required**. Employee Unique Identifier `//tokenize in the future development`|

#### Update an OT request

```http
  PUT /v1/overtime/{empId}
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `dateTime`| `string` | **Required**. ISO 8601 Date and Time (e.g., 2022-02-02 15:00:00.000)|
| `reason`  | `string` | **Required**. Why do you need to extend hours? |
| `empId`   | `string` | **Required**. Employee Unique Identifier `//tokenize in the future development`|

#### Get all OT request

```http
  GET /v1/overtime
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `api_key` | `string` | **Required**. Your API key |

#### Get all OT request per employee

```http
  GET /v1/overtime/${empId}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `empId`      | `string` | **Required**. Id of item to fetch |

```
NOTE: Will be migrated to swagger
```
