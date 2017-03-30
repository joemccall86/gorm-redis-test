package gorm.redis.test

import grails.transaction.Transactional

@Transactional
class BookService {

    def createBook() {
        new Book(author: 'John Doe', pages: 300).save()
    }
}
