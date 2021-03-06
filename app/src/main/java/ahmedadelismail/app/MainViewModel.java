package ahmedadelismail.app;

import io.reactivex.properties.Consumable;
import io.reactivex.properties.Property;

/**
 * Created by Ahmed Adel Ismail on 8/27/2017.
 */
public class MainViewModel extends Model
{


    final Property<String> textViewLabel = new Property<>();
    final Consumable<String> toastMessage = new Consumable<>("started");

    final String randomLabel() {
        return (int) (Math.random() * 10) % 2 == 0
                ? "Even number label"
                : "Odd number label";
    }

    @Override
    protected void clear() {
        textViewLabel.clear();
        toastMessage.clear();
    }

}
