<?php

namespace App\Form;

use App\Entity\Line;
use App\Entity\Order;
use App\Entity\Product;
use Symfony\Bridge\Doctrine\Form\Type\EntityType;
use Symfony\Component\Form\AbstractType;
use Symfony\Component\Form\FormBuilderInterface;
use Symfony\Component\OptionsResolver\OptionsResolver;

class LineType extends AbstractType
{
  public function buildForm(FormBuilderInterface $builder, array $options): void
  {
    $builder
      ->add('cantidad')
      //             ->add('product', EntityType::class, [
      //                 'class' => Product::class,
      // 'choice_label' => 'id',
      //             ])
      //             ->add('orderLine', EntityType::class, [
      //                 'class' => Order::class,
      // 'choice_label' => 'id',
      //             ])
    ;
  }

  public function configureOptions(OptionsResolver $resolver): void
  {
    $resolver->setDefaults([
      'data_class' => Line::class,
    ]);
  }
}
