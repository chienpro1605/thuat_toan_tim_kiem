package thuattoantimkiemnhiphan;

public class BinarySeach {
    static int[] list = {2,4,7,10,11,45,50,59,60,66,69,70,79};

    static int binarySeach(int[] list, int key){
        int low =0;
        int hight = list.length - 1;
        while (hight>=low){
            int mid = (hight+low)/2;
            if (key<list[mid]){
                hight = mid -1;
            }else if (key == list[mid]){
                return mid;
            }else {
                low = mid +1;
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySeach(list,2));
        System.out.println(binarySeach(list,50));
    }

}
