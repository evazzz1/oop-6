Используем принципы:

Принцип единственной ответственности (Single Responsibility Principle, SRP):
- Каждый класс отвечает только за одну функциональность: Calculator для выполнения операций, BinaryConverter для конвертации чисел в двоичный формат, а операции и конвертеры для своих конкретных задач.

Принцип открытости/закрытости (Open Closed Principle, OCP):

- Классы Calculator и BinaryConverter закрыты для изменений (модификации), но открыты для расширений: новые операции и конвертеры могут быть добавлены без изменения существующего кода.

Принцип подстановки Барбары Лисков (Liskov Substitution Principle, LSP):

- Классы IntegerBinaryConverter и DoubleBinaryConverter могут быть использованы вместо BinaryConverter, не изменяя ожидаемого поведения.

Принцип разделения интерфейса (Interface Segregation Principle, ISP):

- Интерфейс BinaryConverter разделён на более мелкие интерфейсы BinaryIntegerConverter и BinaryDoubleConverter, чтобы клиенты зависели только от методов, которые они используют.

Принцип инверсии зависимостей (Dependency Inversion Principle, DIP):

- Класс Calculator принимает операцию через конструктор и сохраняет её в поле operation.
Это позволяет Calculator зависеть от абстракции (интерфейса Operation), а не от конкретных реализаций операций.