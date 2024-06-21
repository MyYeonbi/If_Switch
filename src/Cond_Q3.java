public class Cond_Q3 {
    public static void main(String[] args) {
        //주어진 거리에 따라 가장 적합한 운송 수단을 선택하는 프로그램을 작성.
        // 거리가 1km 이하라면 "도보"
        // 거리가 10km 이하라면 "자전거"
        // 거리가 100km 이하하면 "자동차"
        // 거리가 100km 초과라면 "비행기"
        int distance = 70;
        if (distance <= 1){
            System.out.println("도보" + "를 이용하세요");
        } else if (distance > 1 && distance <= 10){
            System.out.println("자전거" + "를 이용하세요");
        } else if (distance > 10 && distance <= 100) {
            System.out.println("자동차" + "를 이용하세요");
        } else if (distance > 100){
            System.out.println("비행기" + "를 이용하세요");
        }
    }
}
