class Person {
    private String name;
    private int age;

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static class Builder {
        private String name;
        private int age;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(name, age);
        }
    }

    public static void main(String[] args) {
        Person person = new Person.Builder()
                .setName("Alice")
                .setAge(30)
                .build();

        System.out.println(person.name + " is " + person.age + " years old.");
    }
}
