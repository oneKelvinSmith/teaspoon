import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LengthTest {

    @Test
    public void shouldKnowThatOneFootIsEqualToTwelveInches() {
        assertTrue(new Length(1, Unit.FOOT).equals(new Length(12, Unit.INCH)));
    }

    @Test
    public void shouldKnowThatOneFootIsNotEqualOneInch() {
        assertFalse(new Length(1, Unit.FOOT).equals(new Length(1, Unit.INCH)));
    }

    @Test
    public void shouldKnowThatTwoLengthsInInchMayBeEqual() {
        assertTrue(new Length(1, Unit.INCH).equals(new Length(1, Unit.INCH)));
    }

    @Test
    public void shouldKnowThatTwoLengthsInFootMayBeEqual() {
        assertTrue(new Length(1, Unit.FOOT).equals(new Length(1, Unit.FOOT)));
    }

    @Test
    public void shouldKnowThatLengthAndNullAreNotEqual() throws Exception {
        assertFalse(new Length(1, Unit.INCH).equals(null));
    }

    @Test
    public void shouldKnowThatLengthAndObjectAreNotEqual() throws Exception {
        assertFalse(new Length(1, Unit.FOOT).equals(new Object()));
    }

    @Test
    public void shouldKnowThatALengthInFootMayNotBeEqualToALengthInYard() throws Exception {
        assertFalse(new Length(1, Unit.FOOT).equals(new Length(1, Unit.YARD)));
    }

    @Test
    public void shouldKnowThatALengthFootMayBeEqualToALengthInYard() throws Exception {
        assertTrue(new Length(3, Unit.FOOT).equals(new Length(1, Unit.YARD)));
    }

    @Test
    public void shouldKnowThatALengthYardMayBeEqualToALengthInInches() throws Exception {
        assertTrue(new Length(1, Unit.YARD).equals(new Length(36, Unit.INCH)));
    }

    @Test
    public void shouldKnowThatALengthInFurlongMayBeEqualToALengthInFeet() throws Exception {
        assertTrue(new Length(1, Unit.FURLONG).equals(new Length(660, Unit.FOOT)));
    }

    @Test
    public void shouldKnowThatALengthInInchesMayBeEqualToALengthInFurlongs() throws Exception {
        assertTrue(new Length(7920, Unit.INCH).equals(new Length(1, Unit.FURLONG)));
    }

    @Test
    public void shouldKnowThatALengthInYardsMayBeEqualToALengthInFurlongs() throws Exception {
        assertTrue(new Length(220, Unit.YARD).equals(new Length(1, Unit.FURLONG)));
    }

    @Test
    public void shouldKnowThatALengthInMilesMayBeEqualToALengthInInches() throws Exception {
        assertTrue(new Length(1, Unit.MILE).equals(new Length(63360, Unit.INCH)));
    }

    @Test
    public void shouldKnowThatALengthInFeetMayBeEqualToALengthInMiles() throws Exception {
        assertTrue(new Length(5280, Unit.FOOT).equals(new Length(1, Unit.MILE)));
    }

    @Test
    public void shouldKnowThatALengthInMilesMayBeEqualToALengthInLeagues() throws Exception {
        assertTrue(new Length(3, Unit.MILE).equals(new Length(1, Unit.LEAGUE)));
    }

    @Test
    public void shouldKnowThatALengthInInchesMayBeEqualToALengthInLeagues() throws Exception {
        assertTrue(new Length(190080, Unit.INCH).equals(new Length(1, Unit.LEAGUE)));
    }

    @Test
    public void shouldKnowThatALengthInInchesMayBeEqualToALengthInFathoms() throws Exception {
        assertTrue(new Length(22238.208, Unit.INCH).equals(new Length(1, Unit.FATHOM)));
    }

    @Test
    public void shouldKnowOneCableIsOneHundredFathoms() throws Exception {
        assertTrue(new Length(1, Unit.CABLE).equals(new Length(100, Unit.FATHOM)));
    }

    @Test
    public void shouldKnowThatALengthInNauticalMileMayBeEqualToALengthInCable() throws Exception {
        assertTrue(new Length(1, Unit.NAUTICAL_MILE).equals(new Length(10, Unit.CABLE)));
    }
}
