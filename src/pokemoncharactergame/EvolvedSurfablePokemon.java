package pokemoncharactergame;

// Flat 한 설계를 지향하는 컨벤션 또는 프로그래밍 방법론에 따르면,
// "implements ISurfable, ICrossable" 형태로 정보가 가려지지 않게 두는 것도 바람직하다.
//public class EvolvedSurfablePokemon extends EvolvedPokemonStruct implements ISurfable, ICrossable{
public class EvolvedSurfablePokemon extends EvolvedPokemonStruct implements ISurfable {
    public EvolvedSurfablePokemon(String monsterName, int maxHp,
                                  String skill1Name, int skill1Dmg,
                                  String skill2Name, int skill2Dmg) {
        super(monsterName, maxHp, skill1Name, skill1Dmg, skill2Name, skill2Dmg);
    }

    public EvolvedSurfablePokemon(String monsterName, String nickName, int maxHp,
                                  String skill1Name, int skill1Dmg,
                                  String skill2Name, int skill2Dmg) {
        super(monsterName, nickName, maxHp, skill1Name, skill1Dmg, skill2Name, skill2Dmg);
    }

    @Override
    public void surf() {
        System.out.println(this.getMonsterName()+" (이)가 서핑으로 바다를 건넙니다.");
    }

    // ISurfable 에서 이미 아래와 같이 Override 된 default 메서드를 상속받음
    // 단, `implements ISurfable, ICrossable` 과 같은 형태로 클래스를 선언한 경우 아래 오버라이드를 명시적으로 수행해야 함
//    @Override
//    public void crossOcean() {
//        surf();
//    }
}