@ClassAnnotation
@RuntimeAnnotation
@SourceAnnotation
@InheritAnnotation
//@DefaultValueAnnotation
public class Book {

    @DefaultValueAnnotation
    public String publicAttr;

    @DefaultValueAnnotation("value 값 채워짐")
    private String name;
    @NonDefaultValueAnnotation(name="채워야 한다.")
    private String isbn;

    @NonDefaultValueAnnotation(name="안채울 수 없다.")
    @NonDefaultValueAnnotation(name="안채울 수 없다.")
    private String secretName;

    private double randomNumber= Math.random();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    private int sum(int a, int b){
        return a + b;
    }

    public Book() {
    }

    public Book(String name, String isbn, double randomNumber) {
        this.name = name;
        this.isbn = isbn;
    this.randomNumber = randomNumber;
    }
}
