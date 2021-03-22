# ShopSysteame
Training project to consolidate knowledge on Spring and Hibernate frameworks.

## Summary: 
This traning progect for learning Spring frameworks: Spring MVC, Spring DATA, Spring IoC, Spring Boot.

## About the project itself: 
A free HTML, CSS, and JS web store template has been found. Implemented all the logic relating to goods such as: representing them in a database the PostgresSQL, CRUD operations are implemented using Spring Data, data transfer to the client is implemented with Spring MVC, display on the client with Thymeleaf, access to the admin panel with Spring Security.

## Items modul:
![alt](https://github.com/Ruslan-Pipan/ShopSysteame/blob/Ruslan/src/screenshot/%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA.JPG)
 
+ "ListItems" - The interface should implement all classes display of goods.

+ "HotDealList" - The interface for  goods with discounts.

+ "HotDealsListByDiscount" - The Class which implemented "HotDealList", and get goods from DB by the biggest discounts.

+ "BestsellerItems" - Implemented "ListItems" and get goods from DB by the biggest ratings.

+ "LastItem" - Implement "ListItems" and get goods from DB by last records.

+ "LastSaleItems" - Implement "ListItems" and get goods from DB by last records which have discounts.

+ "RandomItems" - Implement "ListItems" and get goods from DB by last random records.

+ "Basket" - Represents the shop basket.

+ "DefaultBasket" - Implement "Basket".

+ "HotDeal" - Presents goods which have a discout with a timer to end discound.

+ "Items" - Its goods

+ "CategoryItems" 

+ "Statistic" - Statistic of goods.

+ "ItemRepository"

+ "CategoryRepository"
 
## Email notifier when add: 
I used the pattern "Fasad". To when added new goods consumer recived notify.
![alt](https://github.com/Ruslan-Pipan/ShopSysteame/blob/Ruslan/src/screenshot/Fasad.JPG)

+ "AddItemNotifierConsumerFacade" - Add new goods to DB, and notify consumers.

+ "ItenRepository" - Used for added new goods to DB.

+ "Mail" - Its mail which receive Consumer.

+ "EmailService" - The interface which responsible for send emails.

+ "NewProductNotifierEmailService" - Implemented "EmailServise" to send notifications to consumers about new goods.

## Work with DB:
All works with DB I implemented by using Hibernate, and Spring DAO.

## To summarize: 
On this project, I gained knowledge to work with Spring frameworks: Spring MVC, Spring IoC, Spring DATA, Spring Boot, and Hibernate.
