public class Zearth {
    static final double EARTH_RADIUS = 6400;
    static final double EARTH_SURFACE_AREA;

    static {
        EARTH_SURFACE_AREA = 4* Math.PI * EARTH_RADIUS *EARTH_RADIUS;
    }
}
//스태틱 파이널에 붙은 변수값은 무조건 대문자로
//스태틱이 없으면 인스턴스