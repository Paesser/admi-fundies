class Marathon {
    // This method will return the fastest time from the given list 
    public static int fastestTime(int[] times) {
        
        int fastestTimeSoFar = times[0];
        
        for (int i = 0; i < times.length; i++) {
            int currentTime = times[i];

            if (currentTime < fastestTimeSoFar) {
                fastestTimeSoFar = currentTime;
            }
        }

        return fastestTimeSoFar;
    }

    // // Returns the second fastest time ran
    // public static int secondFastestTime(int[] times) {
    //     int fastestTime = fastestTime(times);
    //     int secondFastestTime = times[0];

    //     for (int i = 0; i < times.length; i++) {
    //         int currentTime = times[i];

    //         if ((currentTime > fastestTime) && (currentTime < secondFastestTime)) {
    //             secondFastestTime = currentTime;
    //         }
    //     }

    //     return secondFastestTime;
    // }

    public static int secondFastestTime2(int[] times) { 
        int fastestTimeSoFar = times[0];
        int secondFastestTimeSoFar = times[0];
        
        for (int i = 0; i < times.length; i++) {
            int currentTime = times[i];
            
            if (currentTime < fastestTimeSoFar) {
                fastestTimeSoFar = currentTime;
            }
            if (currentTime < secondFastestTimeSoFar) {
                secondFastestTimeSoFar = currentTime;
            }
        }

        return secondFastestTimeSoFar;
    }

    public static void main (String[] arguments) {
        String[] names = {
            "Abdullah", "Tumo", "Cyrus", "Mwangi", "Ndungu", "Matt", "Alex",
            "Abel", "John", "James", "Jane", "Kiprotich", "Daniel", "Wilson",
            "Aaron", "William"};

        int[] times = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
            343, 317, 265
        };

        int fastestTime = fastestTime(times);
        int secondFastestTime = secondFastestTime2(times);


        System.out.println("The fastest time ran was " + fastestTime);
        System.out.println("The second fastest time ran was " + secondFastestTime);
        /*
         * Your output should look something like: 
         *  The fatest time ran was 200
         */
    }
}