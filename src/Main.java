public class Main {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        System.out.printf("\n%d\n",outerClass.averageOfPassingExam);
        System.out.println("------------");
        OuterClass.StaticNestedClass staticNestedClass =
                new OuterClass.StaticNestedClass();
        System.out.println("------------");
        OuterClass.StaticNestedClass.InsideStaticNestedClass
                insideStaticNestedClass = new OuterClass.StaticNestedClass.InsideStaticNestedClass();

        System.out.println("------------");

        OuterClass.StaticNestedClass.InsideNonStaticClass insideNonStaticClass =
                staticNestedClass.new InsideNonStaticClass();
        System.out.println("------------");
        OuterClass.NonStaticNestedClass nonStaticNestedClass = outerClass.new NonStaticNestedClass();
        System.out.println(nonStaticNestedClass);
        System.out.println("------------");
        OuterClass.NonStaticNestedClass.StaticInsideNonStatic staticInsideNonStatic =
                new OuterClass.NonStaticNestedClass.StaticInsideNonStatic();
        OuterClass.NonStaticNestedClass.StaticInsideNonStatic.
                NonStaticClassInsideStaticInsideNonStaticClass
                nonStaticClassInsideStaticInsideNonStaticClass =
                staticInsideNonStatic.new
                NonStaticClassInsideStaticInsideNonStaticClass();
        System.out.println("-------");
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        System.out.println("-------");
        OuterClass.InnerClass.StaticClassInsideInnerClass staticClassInsideInnerClass
                = new OuterClass.InnerClass.StaticClassInsideInnerClass();
        System.out.println("-------");
        OuterClass.InnerClass.NonStaticClassInsideInnerClass nonStaticClassInsideInnerClass =
                innerClass.new NonStaticClassInsideInnerClass();
        nonStaticClassInsideInnerClass.instanceMethod();
        System.out.println("-------");
        Object anonymous = new Object(){
            @Override
            public String toString() {
                return "Anonymous Class";
            }
        };
        System.out.println(anonymous);

    }
}