module java.demo {
    /*
    * This means our java demo module is going to export the advanced package, because we only included the data structure
    * packages so the iterator package is not exported to the outside world
    * */
    exports com.mt.advanced.datastrutures;

    requires java.instrument;
    requires jdk.attach;
    requires jdk.internal.jvmstat;
    requires java.net.http;
}