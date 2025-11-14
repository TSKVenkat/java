class matrixthread{
    class rowmultiplier extends Thread{
        int[][] A,B,C;
        int row;

        rowmultiplier(int[][] A, int[][] B, int[][] C, int row){
            this.A=A;
            this.B=B;
            this.C=C;
            this.row=row;
        }

        public void run(){
            for(int j=0;j<B[0].length;j++){
                int sum=0;
                for(int k=0;k<B.length;k++){
                    sum+=A[row][k]*B[k][j];
                }
                C[row][j] = sum;
            }
            System.out.println("Thread"+row+"completed row"+row);
        }
    }

    static void print(String name, int[][]M){
        System.out.print("\n"+name+"\n");
        for(int[] r:M){
            for(int v:r){
                System.out.print(v+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws InterruptedException{
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] B = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int[][] C = new int[A.length][B[0].length];

        print("Matrix A",A);
        print("Matrix B",B);
        print("Matrix C",C);

        matrixthread mt = new matrixthread();
        rowmultiplier[] threads = new rowmultiplier[A.length];

        for(int i=0;i<A.length;i++){
            threads[i]=mt.new rowmultiplier(A,B,C,i);
            threads[i].start();
        }

        for(rowmultiplier r:threads){
            r.join();
        }

        print("Matrix C",C);
    }
}