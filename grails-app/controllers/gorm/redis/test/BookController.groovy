package gorm.redis.test

class BookController {

    def bookService

    def index() {
        def text = ''
        Book.list().each {
            text += "Author: $it.author, Pages: $it.pages\n"
        }

        text += "$Book.count books total\n"

        render text
    }

    def save() {
        bookService.createBook()
        render 'saved'
    }
}
