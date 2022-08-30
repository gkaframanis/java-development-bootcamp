# equals()

The default ***equals()***
- compares references of two objects
- we can customize equals to compare fields.

        public boolean equals (Object obj) {
            1. return false if obj is null
            2. return false if obj is not instance of correct class
            3. convert obj to the correct class
            4. compare fields from both objects
            5. return the result
        }

Rule: When you "customize" the equals() method, you also need to customize the hashCode() method