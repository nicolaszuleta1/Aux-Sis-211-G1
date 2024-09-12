public class Rotar {

    public static void main(String[] args) {
        //Datos del vector y k
        int []v = {1,2,3,4,5,6,7};
        int k=3;
        System.out.println("Vector inicial:");
        for(int i=0; i<=(v.length)-1;i++){
            System.out.print(v[i]+" ");
        }
        System.out.println();
        //rotar1(v,k);
        rotar2(v,k);
        System.out.println("Vector rotado:");
        for(int i=0; i<=(v.length)-1;i++){
            System.out.print(v[i]+" ");
        }
    }
    //Primera Forma
    public static void rotar1(int[]v, int k){
        int aux;
        int n=v.length;
        for(int i=0; i<k; i++){
            for(int j=n-1; j>0; j--){
            aux = v[j];
            v[j]=v[j-1];
            v[j-1]=aux;
            }
        
        }
    }
    //Segunda Forma (Optimizada)
    public static void rotar2(int[]v, int k){
        
        int n = (v.length)-1;
        
        intercambio(v,0,n);
        intercambio(v,0,k-1);
        intercambio(v,k,n);
        
    }
    public static void intercambio(int[]v, int inicial, int fin){
        int aux;
        while(inicial < fin){
        aux=v[inicial];
        v[inicial]=v[fin];
        v[fin]= aux;
        inicial++;
        fin--;
        }
        
}
    
}