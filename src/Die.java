public class Die {
        private final int MAX = 6; // maximum face value
        private int faceValue; // current value showing on the die

        // Constructor: Set the initial face value
        public Die(){
            faceValue = 1;
        }

        //Rolls the die and returns the result
        public int roll(){
            faceValue = (int)(Math.random() * MAX) + 1;
            return faceValue;
        }

        // Face value mutator (jahesh dahandeh)
        public void setFaceValue (int value){
            faceValue = value;
        }

        // Face value accessor (arzyab)
        public int getFaceValue(){
            return faceValue;
        }

        // Returns a string representation of this die.
        public String toString(){
            String result = Integer.toString(faceValue);
            return result;
        }
    }


