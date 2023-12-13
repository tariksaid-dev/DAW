<?php

namespace App\Form;

use App\Entity\Foro;
use App\Entity\Tema;
use App\Entity\User;
use Symfony\Bridge\Doctrine\Form\Type\EntityType;
use Symfony\Component\Form\AbstractType;
use Symfony\Component\Form\FormBuilderInterface;
use Symfony\Component\OptionsResolver\OptionsResolver;

class TemaType extends AbstractType
{
  public function buildForm(FormBuilderInterface $builder, array $options): void
  {
    $builder
      ->add('name');
    // ->add('date')
    // ->add('status')
    // ->add('user', EntityType::class, [
    //   'class' => User::class,
    //   'choice_label' => 'id',
    // ])
    // ->add('foro', EntityType::class, [
    //   'class' => Foro::class,
    //   'choice_label' => 'id',
    // ]);
  }

  public function configureOptions(OptionsResolver $resolver): void
  {
    $resolver->setDefaults([
      'data_class' => Tema::class,
    ]);
  }
}
