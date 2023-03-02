package designpatterns.behaviour.memento;

public class MainMemento {
    public static void main(String[] args) {
        Article article=new Article(1,"the book of java ");
        article.setContent("write once run any where ");
        System.out.println("First state "+article.toString());
        ArticleMemento articleMemento = article.createArticleMemento();
        article.setContent("Oops added ");
        System.out.println("second state "+article.toString());
        article.restore(articleMemento);
        System.out.println("restored  state "+article.toString());

    }
}
