package net.droidlabs.twowaydatabinding;

import android.databinding.BindingAdapter;
import android.databinding.BindingConversion;
import android.widget.EditText;

public class EditTextBindings
{
    @BindingAdapter({"binding"})
    public static void bindEditText(EditText view, final ObservableString observableString)
    {
        if (view.getTag(R.id.binded) == null)
        {
            view.setTag(R.id.binded, true);
            view.addTextChangedListener(new TextWatcherAdapter()
            {
                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count)
                {
                    observableString.set(s.toString());
                }
            });
        }
        String newValue = observableString.get();
        if (!view.getText().toString().equals(newValue))
        {
            view.setText(newValue);
        }
    }


    @BindingConversion
    public static String convertObservableStringToString(ObservableString observableString)
    {
        return observableString.get();
    }
}