
mongo:
	@echo "Run the database server"
	@docker run -d -it -p 27017:27017 mongo 

run: build
	@echo "Run the application"
	@gradle bootRun

build:
	@echo "Build the application"
	@gradle clean build

# make kill pid="$(lsof -i :8080 | grep java | awk '{print $2}')"
kill:
	@echo "Kill the application running in port $(pid)"
	@kill 8080 $(pid)

pid:
	@echo "[START] Get running process"
	@lsof -i :8080
	@echo "[END] Get running process"