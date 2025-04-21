import { RouteProp } from '@react-navigation/native';
import React from 'react';
import { Text } from 'react-native';
import { RootStackParamList } from '../../componentes/Content'; // Importando o tipo das rotas

type ParkingLotRouteProp = RouteProp<RootStackParamList, 'ParkingLot'>;

type Props = {
  route: ParkingLotRouteProp; // Tipagem correta para acessar os parâmetros da rota
};

const ParkingLot: React.FC<Props> = ({ route }) => {
  const { userId, name } = route.params;  // Acessando os parâmetros passados
  return (
    <Text>Pátio - ID: {userId}, Nome: {name}</Text>
  );
};

export default ParkingLot;
