/**
 */
package de.fzi.power.specification.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import de.fzi.power.specification.util.SpecificationAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class SpecificationItemProviderAdapterFactory extends
		SpecificationAdapterFactory implements ComposeableAdapterFactory,
		IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fzi.power.specification.PowerModelRepository} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerModelRepositoryItemProvider powerModelRepositoryItemProvider;

	/**
	 * This creates an adapter for a {@link de.fzi.power.specification.PowerModelRepository}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createPowerModelRepositoryAdapter() {
		if (powerModelRepositoryItemProvider == null) {
			powerModelRepositoryItemProvider = new PowerModelRepositoryItemProvider(
					this);
		}

		return powerModelRepositoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link de.fzi.power.specification.ResourcePowerModelSpecification} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ResourcePowerModelSpecificationItemProvider resourcePowerModelSpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link de.fzi.power.specification.ResourcePowerModelSpecification}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourcePowerModelSpecificationAdapter() {
		if (resourcePowerModelSpecificationItemProvider == null) {
			resourcePowerModelSpecificationItemProvider = new ResourcePowerModelSpecificationItemProvider(
					this);
		}

		return resourcePowerModelSpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link de.fzi.power.specification.DistributionPowerModelSpecification} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected DistributionPowerModelSpecificationItemProvider distributionPowerModelSpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link de.fzi.power.specification.DistributionPowerModelSpecification}.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDistributionPowerModelSpecificationAdapter() {
		if (distributionPowerModelSpecificationItemProvider == null) {
			distributionPowerModelSpecificationItemProvider = new DistributionPowerModelSpecificationItemProvider(
					this);
		}

		return distributionPowerModelSpecificationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fzi.power.specification.FixedFactor} instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected FixedFactorItemProvider fixedFactorItemProvider;

	/**
	 * This creates an adapter for a {@link de.fzi.power.specification.FixedFactor}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createFixedFactorAdapter() {
		if (fixedFactorItemProvider == null) {
			fixedFactorItemProvider = new FixedFactorItemProvider(this);
		}

		return fixedFactorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.fzi.power.specification.MeasuredFactor} instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected MeasuredFactorItemProvider measuredFactorItemProvider;

	/**
	 * This creates an adapter for a {@link de.fzi.power.specification.MeasuredFactor}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createMeasuredFactorAdapter() {
		if (measuredFactorItemProvider == null) {
			measuredFactorItemProvider = new MeasuredFactorItemProvider(this);
		}

		return measuredFactorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all
	 * {@link de.fzi.power.specification.DeclarativePowerModelSpecification} instances. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected DeclarativePowerModelSpecificationItemProvider declarativePowerModelSpecificationItemProvider;

	/**
	 * This creates an adapter for a {@link de.fzi.power.specification.DeclarativePowerModelSpecification}.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeclarativePowerModelSpecificationAdapter() {
		if (declarativePowerModelSpecificationItemProvider == null) {
			declarativePowerModelSpecificationItemProvider = new DeclarativePowerModelSpecificationItemProvider(
					this);
		}

		return declarativePowerModelSpecificationItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory
				.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(
			ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>)
					|| (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (powerModelRepositoryItemProvider != null)
			powerModelRepositoryItemProvider.dispose();
		if (resourcePowerModelSpecificationItemProvider != null)
			resourcePowerModelSpecificationItemProvider.dispose();
		if (distributionPowerModelSpecificationItemProvider != null)
			distributionPowerModelSpecificationItemProvider.dispose();
		if (fixedFactorItemProvider != null)
			fixedFactorItemProvider.dispose();
		if (measuredFactorItemProvider != null)
			measuredFactorItemProvider.dispose();
		if (declarativePowerModelSpecificationItemProvider != null)
			declarativePowerModelSpecificationItemProvider.dispose();
	}

}
