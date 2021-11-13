### What is thread
- It's a unit of process.

By default Java uses only 1 thread (main thread). EVen if you have a 8 core processor, java will use only 1 core. To make java use 4 cores, we need to use Threading. When threads are used, the Main thread will call the other 3 cores.

### Async task
Suppose you are searching for a product on the Amazon app. When you search for a product, the request goes to the server and without threading the whole app will freeze until we get back the product response, that means our app is only using a single thread.

To avoid this situation, the programs use multi threading. When multithreading is used, the searching task will create another thread and work on it parallely without freezing out the whole app. 