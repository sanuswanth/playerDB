-- End Points Exposed

1) GET List of all players

	HTTP Request Method: GET
	URI: {HOST}/players

2) GET player details by player Id

	HTTP Request Method: GET
	URI: {HOST}/players/{PLAYER_ID}
	
3) Check Health of Service
	
	HTTP Request Method: GET
	URI: {HOST}/ping

-- Info Related to Docker


-- Option 1

	1) Run below command to build docker image:
	
	./mvnw spring-boot:build-image -Dspring-boot.build-image.imageName=springio/gs-spring-boot-docker
	
	2) Run below command to run docker image built
	
	docker run -p 8081:8081 -t springio/gs-spring-boot-docker
	
-- Option 2 Using spring boot fat jars

	Use below command to build docker Image and tagging. Dockerfile is already created and it is at root of this project.
	
	PreRequisites: Docker should be setup on your machine before running these commands
	
	docker build -t springio/gs-spring-boot-docker .
	
	To Run Created image:
	
	docker run -p 8081:8081 springio/gs-spring-boot-docker
	
	
-- References
	
	https://spring.io/guides/gs/spring-boot-docker/# playerDB
