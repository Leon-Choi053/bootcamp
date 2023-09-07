package inclassCoding.W6D3;

@FunctionalInterface
public interface SuperFunction<T, S, U, R>{

  R apply(T t, S s, U u);

}
