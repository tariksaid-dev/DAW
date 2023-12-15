<?php

namespace App\Repository;

use App\Entity\TipoPokemon;
use Doctrine\Bundle\DoctrineBundle\Repository\ServiceEntityRepository;
use Doctrine\Persistence\ManagerRegistry;

/**
 * @extends ServiceEntityRepository<TipoPokemon>
 *
 * @method TipoPokemon|null find($id, $lockMode = null, $lockVersion = null)
 * @method TipoPokemon|null findOneBy(array $criteria, array $orderBy = null)
 * @method TipoPokemon[]    findAll()
 * @method TipoPokemon[]    findBy(array $criteria, array $orderBy = null, $limit = null, $offset = null)
 */
class TipoPokemonRepository extends ServiceEntityRepository
{
    public function __construct(ManagerRegistry $registry)
    {
        parent::__construct($registry, TipoPokemon::class);
    }

//    /**
//     * @return TipoPokemon[] Returns an array of TipoPokemon objects
//     */
//    public function findByExampleField($value): array
//    {
//        return $this->createQueryBuilder('t')
//            ->andWhere('t.exampleField = :val')
//            ->setParameter('val', $value)
//            ->orderBy('t.id', 'ASC')
//            ->setMaxResults(10)
//            ->getQuery()
//            ->getResult()
//        ;
//    }

//    public function findOneBySomeField($value): ?TipoPokemon
//    {
//        return $this->createQueryBuilder('t')
//            ->andWhere('t.exampleField = :val')
//            ->setParameter('val', $value)
//            ->getQuery()
//            ->getOneOrNullResult()
//        ;
//    }
}
