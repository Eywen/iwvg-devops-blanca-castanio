package es.upm.miw.iwvg_devops.code;
public class Searches {

    public Fraction findFractionMultiplicationByUserFamilyName(String familyName){
        return new UsersDatabase().findAll()
                .filter(user -> familyName.equals(user.getFamilyName()))
                .flatMap(user -> user.getFractions().stream())
                .reduce(new Fraction(1,1),
                    (acumulador,fraction) -> {
                        acumulador.multiply(fraction);
                        return acumulador;
                    }
                );
    }
}
