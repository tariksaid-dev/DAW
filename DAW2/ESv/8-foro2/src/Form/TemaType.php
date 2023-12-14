<?php

namespace App\Form;

use App\Entity\Tema;
use Symfony\Component\Form\AbstractType;
use Symfony\Component\Form\FormBuilderInterface;
use Symfony\Component\OptionsResolver\OptionsResolver;
use Symfony\Component\Validator\Constraints\File;
use Symfony\Component\Form\Extension\Core\Type\FileType;
use Symfony\Component\Form\Extension\Core\Type\TextareaType;

class TemaType extends AbstractType
{
  public function buildForm(FormBuilderInterface $builder, array $options): void
  {
    $builder
      ->add('name')
      // ->add('date')
      // ->add('status')
      ->add(
        "imagen",
        FileType::class,
        [
          "label" => "imagen",
          "mapped" => false,
          "required" => false,
          "constraints" => [
            new File([
              "maxSize" => "50000k",
              "mimeTypes" => [
                "image/jpeg",
                "image/png",
              ],
              "mimeTypesMessage" => "Por favor sube un formato de imagen válido"
            ])
          ]
        ]
      )
      ->add("commentText", TextareaType::class, [
        "mapped" => false,
      ]);
  }

  public function configureOptions(OptionsResolver $resolver): void
  {
    $resolver->setDefaults([
      'data_class' => Tema::class,
    ]);
  }
}
