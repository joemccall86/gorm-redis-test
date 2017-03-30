package gorm.redis.test

class Book {

    String author
    Integer pages

    static constraints = {
    }

    // Comment out from here down to observe the behavior with Hibernate
    static mapWith = "redis"

    static mapping  = {
        author index: true
    }
}
