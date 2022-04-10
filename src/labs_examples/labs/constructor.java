package labs_examples.labs;

public class constructor {
    // class declaration
// Employee - class name

        int id;
        String name;
        String surname;

        // The constructor
        // public - access modifier
        // constructor - class name
        // int id, String name, String surname - parameters
        public constructor(int id, String name, String surname) {
            this.id = id;
            this.name = name;
            this.surname = surname;
        }

        // A method on the Employee class
        // public - access modifier
        // boolean - return type
        // equals - method mane
        // Object obj - parameters
        @Override
        public boolean equals(Object obj) {
            constructor other = (constructor) obj;
            return id == other.id || name.equals(other.name);
        }
    }

