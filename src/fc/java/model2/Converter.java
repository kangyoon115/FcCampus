package fc.java.model2;
@FunctionalInterface
public interface Converter<F,T> {
    abstract T convert(F from);
}
