package Package_sorting;

class MassiveSorting {

    public void sorting_insertion(int[] massive) {

        int temp;

        for (int i = 1; i < massive.length; i++) {
            for(int j = i; j > 0 && massive[j-1] > massive[j]; j--) {
                temp = massive[j-1];
                massive[j-1] = massive[j];
                massive[j] = temp;
             }

        }

    }

    public void sorting_selection (int[] massive) {

        for (int i = 0; i < massive.length-1; i++) {
            int least = i;
            for (int j = i+1; j < massive.length; j++) {
                if(massive[j] < massive[least]) {
                    least = j;
                }
            }
            int tmp = massive[i];
            massive[i] = massive[least];
            massive[least] = tmp;
        }

    }

    public void sorting_bubble (int[] massive) {

        for (int i = massive.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (massive[j] > massive[j + 1]) {
                    int tmp = massive[j];
                    massive[j] = massive[j + 1];
                    massive[j + 1] = tmp;
                }
            }
        }

    }

}

