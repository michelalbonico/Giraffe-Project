/**
 * generated by Xtext
 */
package fr.mines_nantes.atlanmod.giraffe.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for a EObjects.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 */
@SuppressWarnings("all")
public class GiraffeDSLLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public GiraffeDSLLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}
