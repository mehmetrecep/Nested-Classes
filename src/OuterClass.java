public class OuterClass {

    int averageOfPassingExam;
    public static String nameOfExam = "Java 1";
    public OuterClass(){
        averageOfPassingExam = 45;
        System.out.printf("From OuterClass Constructor");
    }
    // Static Nested Class
    public static class StaticNestedClass{
        public StaticNestedClass(){
            String st = "Hello From Static Nested Class ";
            System.out.printf("%s\n",st);
            System.out.printf("%s\n",nameOfExam);

        }
        public static class InsideStaticNestedClass{
            public InsideStaticNestedClass(){
                System.out.println(OuterClass.nameOfExam);
                System.out.println("Hello from Inside Static Nested Class");
            }
        }
        public class InsideNonStaticClass{
            public InsideNonStaticClass(){
                System.out.println(OuterClass.nameOfExam);
                System.out.println("Hello from Inside Non-static class");
            }
        }
    }
    public class NonStaticNestedClass{
        public NonStaticNestedClass(){
            System.out.println("Hello from non-static nested class");
        }
        public static class StaticInsideNonStatic{
            public StaticInsideNonStatic(){
                System.out.println("Hello from static class inside Non-static class");
            }
            public class NonStaticClassInsideStaticInsideNonStaticClass{
                public NonStaticClassInsideStaticInsideNonStaticClass(){
                    System.out.println("Hello from non-static class that's inside static class inside Non-static class");
                }
            }
        }
    }

    public class InnerClass{

        public InnerClass(){
            System.out.println("Hello from Inner Class");
            System.out.println(nameOfExam);
            System.out.println(OuterClass.this.averageOfPassingExam);
        }

        public static class StaticClassInsideInnerClass{
            public StaticClassInsideInnerClass(){
                System.out.println("Hello from Static class inside Inner Class");
            }
        }
        public class NonStaticClassInsideInnerClass{
            public NonStaticClassInsideInnerClass(){
                System.out.println(OuterClass.this.averageOfPassingExam);
                System.out.println("Hello from Non StaticClassInsideInnerClass");
            }

            public void instanceMethod(){
                class LocalClass{
                    public LocalClass(){
                        System.out.println("Hello from Local class");
                    }
                }

                LocalClass localClass = new LocalClass();
                Object anonymousObject = new Object(){
                    @Override
                    public String toString() {
                        return "Hello from Anonymous class";
                    }
                };
                System.out.println(anonymousObject);
            }
        }
    }
}
