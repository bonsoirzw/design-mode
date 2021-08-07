package top.zw.learn.creation.builder;

public class Person {

    private String name;

    private String weight;

    private String height;

    private String lover;

    private String age;

    public Person(Builder personBuilder){
        this.name = personBuilder.name;
        this.weight = personBuilder.weight;
        this.height = personBuilder.height;
        this.lover = personBuilder.lover;
        this.age = personBuilder.age;

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", weight='").append(weight).append('\'');
        sb.append(", height='").append(height).append('\'');
        sb.append(", lover='").append(lover).append('\'');
        sb.append(", age='").append(age).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static class Builder {

        private String name;

        private String weight;

        private String height;

        private String lover;

        private String age;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder weight(String weight){
            this.weight = weight;
            return this;
        }

        public Builder lover(String lover){
            this.lover = lover;
            return this;
        }

        public Builder age(String age){
            this.age = age;
            return this;
        }

        public Builder height(String height){
            this.height = height;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }

    public static void main(String[] args) {
        Person person = new Builder()
                .name("zhangsan")
                .age("100")
                .height("100")
                .weight("100")
                .lover("lisi")
                .build();

        System.out.println(person);
    }

}
