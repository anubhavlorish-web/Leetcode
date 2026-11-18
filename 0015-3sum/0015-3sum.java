class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        int n =num.length;
        Set<List<Integer>> st = new HashSet<>();

        for(int i=0;i<n;i++){
            Set<Integer> hashset = new HashSet<>();
            for(int j=i+1;j<n;j++){
                int third = -(num[i]+ num[j]);
                if(hashset.contains(third)){
                    List<Integer> temp = Arrays.asList(num[i], num[j], third);
                    Collections.sort(temp);
                    st.add(temp);
                }
                hashset.add(num[j]);

            }
        }
        return new ArrayList<>(st);
    }
}


//         Set<List<Integer>> st = new HashSet<>();

//         for (int i = 0; i < n; i++) {
//             Set<Integer> hashset = new HashSet<>();
//             for (int j = i + 1; j < n; j++) {
//                 int third = -(num[i] + num[j]);
//                 if (hashset.contains(third)) {
//                     List<Integer> temp = Arrays.asList(num[i], num[j], third);
//                     Collections.sort(temp);
//                     st.add(temp);
//                 }
//                 hashset.add(num[j]);
//             }
//         }

//         return new ArrayList<>(st);
//     }
// }    

// BRUTE FORCE.
// int n=num.length;
// Set<List<Integer>> st = new HashSet<>();
// for (int i = 0; i < n; i++) {
//         for (int j = i + 1; j < n; j++) {
//             for (int k = j + 1; k < n; k++) {
//                 if (num[i] + num[j] + num[k] == 0) {
//                     List<Integer> temp = Arrays.asList(num[i], num[j], num[k]);
//                     temp.sort(null);
//                     st.add(temp);
//                 }
//             }
//         }
//     }

//     return new ArrayList<>(st);
// }
// }
