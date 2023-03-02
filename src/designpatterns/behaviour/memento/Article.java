package designpatterns.behaviour.memento;

public class Article {
    private int id;
    private String name;
    private String content;

    public Article(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ArticleMemento createArticleMemento()
    {
        return new ArticleMemento(id,name,content);
    }

    public void restore(ArticleMemento articleMemento)
    {
        this.id=articleMemento.getId();
        this.name=articleMemento.getName();
        this.content=articleMemento.getContent();
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
