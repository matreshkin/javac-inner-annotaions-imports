src1 отличается  от src только тем, что в классе src1/.../Second импорт MainAnnotation статический, а в src/.../Second - Обычный.

Вот что я получаю.
============================================================
    Compiling src (regular imports)...
    ...OK!
============================================================

============================================================
    Compiling src1 (Second.java has static import)...
src1/com/example/Main.java:17: error: cannot find symbol
    @SecondAnnotation
     ^
  symbol:   class SecondAnnotation
  location: class Main
src1/com/example/Main.java:18: error: cannot find symbol
    @Retention(RetentionPolicy.SOURCE)
     ^
  symbol:   class Retention
  location: class Main
2 errors
============================================================
