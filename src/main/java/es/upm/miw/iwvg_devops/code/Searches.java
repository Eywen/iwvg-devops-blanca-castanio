package es.upm.miw.iwvg_devops.code;

import java.util.stream.Stream;

public class Searches {

    public Fraction findFractionMultiplicationByUserFamilyName(String familyName) {
        return new UsersDatabase().findAll()
                .filter(user -> familyName.equals(user.getFamilyName()))
                .flatMap(user -> user.getFractions().stream())
                .reduce(new Fraction(1, 1),
                        (acumulador, fraction) -> {
                            acumulador.multiply(fraction);
                            return acumulador;
                        }
                );
    }

    public Fraction findFractionDivisionByUserId(String id) {
        return new UsersDatabase().findAll()
                .filter(user -> id.equals(user.getId()))
                .flatMap(user -> user.getFractions().stream())
                .reduce(new Fraction(1, 1),
                        (acumulador, fraction) -> {
                            acumulador.divide(fraction);
                            return acumulador;
                        });
    }

    public Stream<String> findUserFamilyNameByAllNegativeSignFractionDistinct() {
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream()
                        .anyMatch(fraction -> fraction.decimal() < 0))
                .map(User::getFamilyName)
                .distinct();
    }
}
