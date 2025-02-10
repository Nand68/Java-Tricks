// If you know the number of rows (fixed n), but each row can have a different number of elements, then you should use:

ArrayList<Integer>[] ans = new ArrayList[n];

// example 

int n = 5; // Number of rows (groups)

        // Creating an array of ArrayLists
        ArrayList<Integer>[] ans = new ArrayList[n];

        // Initializing each ArrayList
        for (int i = 0; i < n; i++) {
            ans[i] = new ArrayList<>();
        }

        // Adding elements (each row has a different number of elements)
        ans[0].add(1);
        ans[0].add(2);

        ans[1].add(10);

        ans[2].add(5);
        ans[2].add(6);
        ans[2].add(7);

        ans[3].add(100);
        ans[3].add(200);

        ans[4].add(50);

        // Printing the array of lists
        System.out.println(Arrays.toString(ans));
