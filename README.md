### Create Java application - search for real estate in a specific area

the main source of information - http://www.otido.ua/

provide information only about the real estate for sale

### Technology stack:
* java
* gradle
* postgres
* spring & spring boot
* docker
* junit

### Requirements
* Raise the database in a Docker container
* Create a component that will parse the data from an information source, generate the data and save this data to the database
* Create a search engine mechanism that will allow you to search for the information you need by the search criteria
* Elements of the search criteria:
  * number of rooms
  * the address
  * area
  * price
  * floor