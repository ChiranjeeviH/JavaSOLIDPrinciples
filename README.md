# JavaSOLIDPrinciples
SOLID principles




Java internal classes to identify SOLID principles

SRP: ArrayList focuses on list management.
OCP: Comparator allows new comparison strategies without changing sorting logic. (with override the compare method)
LSP: AbstractList allows for substitution with other List implementations. (Can select ArrayList or LinkedList)
ISP: Closeable and AutoCloseable provide focused interfaces for resource management. (both interfaces does similar work but AutoCloseable closes resources without throwing exception hence separate interface)
DIP: Logger class depends on abstractions for logging. (LOGGER doesn't really depends on implementation)