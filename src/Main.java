public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Обьекты Задание 1
        //1. Необходимо создать класс Book, который содержит в себе данные об имени, авторе и годе публикации.
        // Типы полей должны быть String, Author (который мы создадим  в п. 2) и int.
        //2. Необходимо создать класс Author, который содержит в себе данные об имени и фамилии автора.
        //3. Написать конструкторы для обоих классов, заполняющие все поля.
        //4. Создать геттеры для всех полей автора и всех полей книги.
        //5. Создать сеттер для поля «Год публикации» у книги.
        //6. В методе main создать несколько объектов Книга (достаточно двух) и несколько объектов Автор (достаточно тоже двух) и инициализировать друг друга.
        // Учесть, что авторы являются обязательными членами книг и книги не могут создаться без авторов.
        //
        //    Метод main не должен находиться в классах Book и Author.
        //
        //    Требуется создать отдельный класс для запуска приложения и объявить метод main в нем.
        //
        //7. В том же методе main изменить год публикации одной из книг с помощью сеттера.
        System.out.println("Задание 1");
        Book book1 = new Book("War and Peace",1886);
        Book book2 = new Book("Tom Sawyer",1876);
        Authors author1 = new Authors("L.Tolstoy");
        Authors author2 = new Authors("M.Twain");
        System.out.println("book1.title = " + book1.getTitle());
        System.out.println("book1.yearPublishing = " + book1.getYearPublishing());
        System.out.println("author1.authorsName = " + author1.getAuthorsName());
        System.out.println("book2.title = " + book2.getTitle());
        System.out.println("book2.yearPublishing = " + book2.getYearPublishing());
        System.out.println("author2.authorsName = " + author2.getAuthorsName());
        book1.setYearPublishing(1895);
        book2.setYearPublishing(1885);
        System.out.println("book1.getYearPublishing() = " + book1.getYearPublishing());
        System.out.println("book2.getYearPublishing() = " + book2.getYearPublishing());


    }
}