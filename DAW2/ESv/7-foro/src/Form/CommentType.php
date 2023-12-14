<?php

namespace App\Form;

use App\Entity\Comment;
use App\Entity\Tema;
use App\Entity\User;
use Symfony\Bridge\Doctrine\Form\Type\EntityType;
use Symfony\Component\Form\AbstractType;
use Symfony\Component\Form\Extension\Core\Type\FileType;
use Symfony\Component\Form\Extension\Core\Type\TextareaType;
use Symfony\Component\Form\FormBuilderInterface;
use Symfony\Component\OptionsResolver\OptionsResolver;
use Symfony\Component\Validator\Constraints\File;


class CommentType extends AbstractType
{
  public function buildForm(FormBuilderInterface $builder, array $options): void
  {
    $builder
      // ->add('date')
      ->add('text', TextareaType::class, [
        'label' => 'Texto del Comentario',
      ])
      // ->add('status')
      //             ->add('user', EntityType::class, [
      //                 'class' => User::class,
      // 'choice_label' => 'id',
      //             ])
      //             ->add('tema', EntityType::class, [
      //                 'class' => Tema::class,
      // 'choice_label' => 'id',
      //             ])
      ->add(
        "imagen",
        FileType::class,
        [
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
        ]
      );
  }

  public function configureOptions(OptionsResolver $resolver): void
  {
    $resolver->setDefaults([
      'data_class' => Comment::class,
    ]);
  }
}
