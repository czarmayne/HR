# employee-monitoring ![employee-monitoring-status](https://img.shields.io/badge/DESIGN-INPROGRESS-lightgrey)
Streamline the process of approval for overtime and leave

# Principle
https://12factor.net

# Project B2B 

A simple employee tracker that covers team configuration, overtime process, and leave process. It aims to streamline the employee monitoring and provide the necessary reports as needed. 

To know more about the project, kindly visit this [page](https://www.notion.so/c8fe3cdc13a2417a8eadad6af008d5ec?v=94f7f322d24642d6aa2618efa31c5db3).

***Note:*** _It was named B2B (back-to-basics) because as a team, we wanted to explore different technology stack and apply the learnings we’ve gained from work and research._

## Features

- MVP 1: OT Tracker
***Reference***: [Backlog Management](https://www.notion.so/eb04d10d128543fb98b6e9c0ce3eaf21?v=da39c19f744a4bef91dace7545b76702)

## Roadmap

- Leave Tracker
- Team Configuration
- Credit Tracker



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


## Deployment

To deploy this project run `todo: create makefile`

```bash
  make run
```


## Demo

Insert gif or link to demo

`todo: update once deployed in HEROKU`
## Authors

- [@czarmayne](https://www.github.com/czarmayne)
- [@diana](https://www.github.com/dfbdizon)

