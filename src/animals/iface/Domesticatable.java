package animals.iface;

/**
 * This interface allows an animal to be able to be domesticated.
 */
public interface Domesticatable {

    /**
     * @return a String with a nice message.
     */
    public String goodBoy();

    /**
     * @return a Boolean that returns true if the animal has been domesticated.
     */
    public Boolean hasBeenDomesticated();
}
