<?php

namespace App\Form;

use App\Entity\Pokemon;
use App\Entity\TipoPokemon;
use Symfony\Bridge\Doctrine\Form\Type\EntityType;
use Symfony\Component\Form\AbstractType;
use Symfony\Component\Form\Extension\Core\Type\ChoiceType;
use Symfony\Component\Form\Extension\Core\Type\FileType;
use Symfony\Component\Form\FormBuilderInterface;
use Symfony\Component\OptionsResolver\OptionsResolver;
use Symfony\Component\Validator\Constraints\File;


class PokemonType extends AbstractType
{
  public function buildForm(FormBuilderInterface $builder, array $options): void
  {
    $builder
      ->add('name')
      ->add('number')
      ->add('type', EntityType::class, [
        "class" => TipoPokemon::class,
        "choice_label" => "nombre",
        "placeholder" => "Selecciona un tipo",
        "required" => true,
      ])
      ->add('imagen', FileType::class, [
        "label" => "imagen",
        "mapped" => false,
        "required" => false,
        "constraints" => [
          new File([
            "maxSize" => "500000k",
            "mimeTypes" => [
              "image/jpeg",
              "image/png",
            ],
            "mimeTypesMessage" => "Por favor sube una imagen válida",
          ])
        ],
      ]);
  }

  public function configureOptions(OptionsResolver $resolver): void
  {
    $resolver->setDefaults([
      'data_class' => Pokemon::class,
    ]);
  }
}
