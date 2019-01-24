package models;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.CollectionTable;
import javax.persistence.Entity;
import javax.persistence.Id;

 @Entity
    public class Book extends Model {
     @Id
     @Constraints.Required
        public Integer id;
     @Constraints.MaxLength(255)
     @Constraints.MinLength(5)
      @Constraints.Required
        public String title;
     @Constraints.Min(5)
     @Constraints.Max(100)
     @Constraints.Required
        public  Integer price;
     @Constraints.Required
        public String author;


        public static Finder<Integer, Book> find = new Finder<>(Book.class);

}
